package com.ecmprojectbackend.infrastructure.persistence.jpa.field.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.fieldType.entity.FieldTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.process.entity.ProcessEntity
import lombok.NoArgsConstructor
import javax.persistence.*


@Entity
@Table(name = "[field]")
@NoArgsConstructor
data class FieldEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    val id: Long?,
    @ManyToOne
    @JoinColumn(name = "[fieldtype]")
    val fieldType: FieldTypeEntity?,
    @ManyToOne
    @JoinColumn(name = "process")
    val process: ProcessEntity?,
    @Column
    val value: String,
        ){
}