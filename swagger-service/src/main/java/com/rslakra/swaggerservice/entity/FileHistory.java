package com.rslakra.swaggerservice.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Rohtash Lakra (rlakra)
 * @created 8/4/21 6:03 PM
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "file_history")
public class FileHistory extends BaseEntity<String> {

    private String contents;

    @Enumerated(EnumType.STRING)
    private Operation operation;

    @ManyToOne
    @JoinColumn(name = "file_id", foreignKey = @ForeignKey(name = "FK_FileHistory_File"))
    private File file;

    public FileHistory() {
        super();
    }

    public FileHistory(File file, Operation operation) {
        if (file != null) {
            this.file = file;
            this.contents = file.getContents();
        }

        this.operation = operation;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
