package com.example.sqlitetest6

import java.io.Serializable

class UserModel : Serializable {

    var name: String? = null
    var title: String? = null
    var link: String? = null
    var id: Int = 0

    fun getIds(): Int {
        return id
    }

    fun setIds(id: Int) {
        this.id = id
    }

    fun getNames(): String {
        return name.toString()
    }

    fun setNames(name: String) {
        this.name = name
    }

    fun getTitles(): String {
        return title.toString()
    }

    fun setTitles(title: String) {
        this.title = title
    }

    fun getLinks(): String {
        return link.toString()
    }

    fun setLinks(link: String) {
        this.link = link
    }

}