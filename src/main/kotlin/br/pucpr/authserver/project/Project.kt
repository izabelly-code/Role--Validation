package br.pucpr.authserver.project

import br.pucpr.authserver.task.Task
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull
import java.sql.Date

@Entity
@Table(name="tbProject")
class Project (

    @Id
    @GeneratedValue
    var id: Long? = null,

    @NotNull
    var name: String,

    @NotNull
    var dataEntrega: Date,

   @OneToMany(mappedBy = "tbProject")
    val tasks: MutableSet<Task> = mutableSetOf()

    )