package ru.netology.service



import org.junit.Assert
import ru.netology.data.Comments
import ru.netology.data.Post

class WallServiceTest {

    @org.junit.Test
    fun add() {
        val secondOrigin = Post(
            id = 2,
            authorId = 15,
            fromId = 142132,
            createdBy = 0,
            date = 1,
            text = "I dont wanna see fck stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned= true,
            markedAsAds= true,
            postponedId = 1
        )
        WallService.add(secondOrigin)
        Assert.assertEquals(1, WallService.posts.size)
    }

    @org.junit.Test
    fun add_3() {
        val secondOrigin = Post(
            id = 2,
            authorId = 15,
            fromId = 142132,
            createdBy = 0,
            date = 1,
            text = "I dont wanna see fck stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned= true,
            markedAsAds= true,
            postponedId = 1
        )
        WallService.add(secondOrigin)
        val secondOriginTest = Post(
            id = 2,
            authorId = 15,
            fromId = 142132,
            createdBy = 0,
            date = 1,
            text = "I dont wanna see fck stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned= true,
            markedAsAds= true,
            postponedId = 1
        )
        WallService.add(secondOriginTest)
        Assert.assertEquals(1, WallService.posts.size)
    }

    @org.junit.Test
    fun add_2() {
        val firstOrigin = Post(
            id = 2,
            authorId = 15,
            fromId = 142132,
            createdBy = 0,
            date = 1,
            text = "I dont wanna see stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned= true,
            markedAsAds= true,
            postponedId = 1
        )
        val secondOrigin = Post(
            id = 2,
            authorId = 20,
            fromId = 142132,
            createdBy = 0,
            date = 1,
            text = "I dont wanna see stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned= true,
            markedAsAds= true,
            postponedId = 1
        )
        WallService.add(secondOrigin)
        Assert.assertEquals(firstOrigin.authorId, WallService.giveLast().authorId)
    }

    @org.junit.Test
    fun update() {
        val secondOrigin = Post(
            id = 2,
            authorId = 15,
            fromId = 142132,
            createdBy = 0,
            date = 1,
            text = "I dont wanna see stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned= true,
            markedAsAds= true,
            postponedId = 1
        )
        WallService.add(secondOrigin)
        val secondMaster = Post(
            id = 2,
            authorId = 20,
            fromId = 142132,
            createdBy = 0,
            date = 12,
            text = "Stars is really beautiful",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = false,
            comments = Comments(1, true, true, true, true),
            signerId = 1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned= false,
            markedAsAds= false,
            postponedId = 1
        )
        WallService.update(secondMaster)

    }

    @org.junit.Test
    fun showLast() {
        val secondOrigin = Post(
            id = 2,
            authorId = 15,
            fromId = 142132,
            createdBy = 0,
            date = 1,
            text = "I dont wanna see stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            signerId = 1,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned= true,
            markedAsAds= true,
            postponedId = 1
        )
        WallService.add(secondOrigin)
        val secondMaster = Post(
            id = 2,
            authorId = 20,
            fromId = 142132,
            createdBy = 0,
            date = 12,
            text = "Stars is really beautiful",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = false,
            comments = Comments(1, true, true, true, true),
            signerId = 1,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned= false,
            markedAsAds= false,
            postponedId = 1
        )
        WallService.update(secondMaster)
        WallService.showLast()
        Assert.assertEquals(secondOrigin.authorId, WallService.giveLast().authorId)
    }
}

