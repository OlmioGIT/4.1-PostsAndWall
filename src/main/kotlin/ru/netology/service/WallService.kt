package ru.netology.service

import ru.netology.data.Post

object WallService {
    var posts = emptyArray<Post>()
    open var i : Int = 0

    fun add (post:Post ) :Post{
        if (posts.isEmpty()){
            posts+= post
        }
        if (posts.isNotEmpty()) {
            for ((index, storePost: Post) in posts.withIndex())
                if (post.id == storePost.id) i += 1
        }
        if (i<posts.size) posts+= post
        i=0
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var result = false
        for ((index, storePost: Post) in posts.withIndex())
            if (post.id == storePost.id) {
                posts[index] = post.copy(authorId = storePost.authorId, date = storePost.date)
                result = true
            }
        return result
    }

    fun showLast() {
        println(posts.last())
    }
    fun giveLast(): Post {
//        val postLast : Post = posts.last()
        return posts.last()
    }
}


