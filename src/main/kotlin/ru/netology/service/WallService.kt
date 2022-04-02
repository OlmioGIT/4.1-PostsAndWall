@file:Suppress("UNUSED_VALUE")

package ru.netology.service

import ru.netology.data.Comment
import ru.netology.data.Post
import ru.netology.data.Comments

object WallService {
    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()
    var i : Int = 0

    fun findById(id:Long) : Post?{
        for (post in posts) {
            if (post.id == id){
                return post
            }
        }
        return null
    }




    fun add (post:Post ) :Post{
        if (posts.isEmpty()){
            posts+= post
        }
        if (posts.isNotEmpty()) {
            for (storePost: Post in posts)
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

    class CommentDontAddException(message: String): NullPointerException(message)



    fun createComment (comment: Comment) {
        var toThrow = true

        for (storePost: Post in posts) {
            if (comment.PostId == storePost.id) {
                toThrow = false
                comments += comment
            }
        }
        if (toThrow) {
            throw CommentDontAddException("Не нашлось поста для этого коментария.")
        }
        toThrow = true
    }
}




