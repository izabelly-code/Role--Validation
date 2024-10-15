package br.pucpr.authserver.task

import br.pucpr.authserver.users.User
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import jakarta.validation.constraints.NotNull

@Entity
@Table(name="tbTask")
class Task(
    @Id @GeneratedValue
    var id: Long? = null,

    @NotNull
    var descrição: String,

    @ManyToOne
    var  user: User

)
