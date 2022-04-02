package ru.netology.service



import org.junit.Assert
import ru.netology.data.*

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
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
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
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
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
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
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
            text = "I dont wanna see fck stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
        )
        val secondOrigin = Post(
            id = 2,
            authorId = 20,
            fromId = 142132,
            createdBy = 0,
            date = 1,
            text = "I dont wanna see fck stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
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
            text = "I dont wanna see fck stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
        )
        WallService.add(secondOrigin)
        val secondMaster = Post(
            id = 2,
            authorId = 20,
            fromId = 142132,
            createdBy = 0,
            date = 1,
            text = "I dont wanna see fck stars",
            replyOwnerId = 1,
            replyPostId = 1,
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
        )
        WallService.update(secondMaster)
        Assert.assertEquals(secondOrigin.authorId, WallService.giveLast().authorId)
    }

    @org.junit.Test
    fun showLast() {
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
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
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
            friendsOnly = true,
            comments = Comments(1, true, true, true, true),
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
        )
        WallService.update(secondMaster)
        WallService.showLast()
        Assert.assertEquals(secondOrigin.authorId, WallService.giveLast().authorId)
    }

    @org.junit.Test
    fun createComment() {

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
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
        )

        val newComment = Comment(
            authorId = 20,
            PostId = 2,
            fromGroup = 0,
            message = "Ты не прав...",
            replyToUser = null,
            replyToComment= null,
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            stickerId = null
        )
        WallService.add(secondOrigin)
        WallService.createComment(newComment)
        Assert.assertEquals(true, WallService.comments.isNotEmpty())
    }

    @org.junit.Test(expected = WallService.CommentDontAddException::class)
    fun createCommentFall() {

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
            copyright = null,
            likes = Likes(userLikes = true, canLike = true, canPublish = true, count = 4),
            reposts = Reposts(id = 15, user_reposted = true),
            views = 77,
            postType = "",
            postSource = "",
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            geo = null,
            signerId = 1,
            copyHistory = "",
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            donut = null,
            postponedId = 1,
        )

        val newComment = Comment(
            authorId = 20,
            PostId = 15,
            fromGroup = 0,
            message = "Ты не прав...",
            replyToUser = null,
            replyToComment= null,
            attachments = PhotoAttachments(url = "",id =12,ownerId = 15,albumId = 12, updateUserId = 121),
            stickerId = null
        )
        WallService.add(secondOrigin)
        WallService.createComment(newComment)
        Assert.assertEquals(true, WallService.comments.isNotEmpty())

    }

}

