package com.ecmprojectbackend.infrastructure.persistence.jpa.route.entity


import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import lombok.NoArgsConstructor
import javax.persistence.*

@Entity
@Table(name = "[route]")
@NoArgsConstructor
data class RouteEntity (
    @Id
    val id: String?,
    @Column
    val name: String,
    @Column
    val nameKey: String,
    @Column
    val content: String,
    @ManyToOne
    @JoinColumn(name = "activity")
    val activity: ActivityTypeEntity?,
    @ManyToOne
    @JoinColumn(name = "next_activity")
    val nextActivity: ActivityTypeEntity?
        ){
}