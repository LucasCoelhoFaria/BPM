package com.ecmprojectbackend.infrastructure.persistence.jpa.processType.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.dataType.entity.DataTypeEntity
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "[processtype]")
@NoArgsConstructor
data class ProcessTypeEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column
    val version: Int,
    @ManyToOne
    @JoinColumn(name = "datatype")
    val dataType: DataTypeEntity?,
    @Column
    val name: String,
    @Column
    val content: String,
    @ManyToOne
    @JoinColumn(name = "first_activity")
    val firstActivity: ActivityTypeEntity?
        ){
}