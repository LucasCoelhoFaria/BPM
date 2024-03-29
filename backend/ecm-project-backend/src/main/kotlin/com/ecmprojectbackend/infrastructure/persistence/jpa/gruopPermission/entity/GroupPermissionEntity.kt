package com.ecmprojectbackend.infrastructure.persistence.jpa.gruopPermission.entity

import com.ecmprojectbackend.infrastructure.persistence.jpa.activityType.entity.ActivityTypeEntity
import com.ecmprojectbackend.infrastructure.persistence.jpa.user.entity.UserEntity
import javax.persistence.*

@Entity
@Table(name = "[grouppermission]")
data class GroupPermissionEntity (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        val id: Long?,
        @Column
        val name: String,
        @OneToMany(mappedBy = "id", cascade = [CascadeType.ALL])
        val permissions: List<PermissionEntity>?,
        @ManyToMany
        @JoinTable(
                name = "activitygroup",
                joinColumns = [JoinColumn(name = "grouppermission")],
                inverseJoinColumns = [JoinColumn(name = "activitytype")]
        )
        val activities: List<ActivityTypeEntity>?,
        @ManyToMany
        @JoinTable(
                name = "usergroup",
                joinColumns = [JoinColumn(name = "grouppermission")],
                inverseJoinColumns = [JoinColumn(name = "user")]
        )
        val users: List<UserEntity>?
        )