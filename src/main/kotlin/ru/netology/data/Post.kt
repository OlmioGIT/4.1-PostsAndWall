package ru.netology.data

import ru.netology.service.WallService

data class Post(
    val id: Long = 0,
    val authorId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String?,
    val replyOwnerId: Int?,
    val replyPostId: Int?,
    val friendsOnly: Boolean = false,
    val comments: Comments?,
    val copyright: Copyright?,
    val likes: Likes,
    val reposts: Reposts?,
    val views: Int = 0,
    val postType: String,
    val postSource: String,
    val attachments: Attachment?,
    val geo: Geo?,
    val signerId: Int,
    val copyHistory: String?,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut?,
    val postponedId: Int?,
)

interface Attachment{
    val url :String
    val id :Int
    val ownerId:Int

}

class PhotoAttachments(
    override val url: String,
    override val id: Int,
    override val ownerId:Int,
    val albumId: Int,
    val updateUserId: Int
) : Attachment

class VideoAttachments(override val url: String = "",
        override val id: Int = 15,
        override val ownerId:Int = 15) :Attachment

class AudioAttachments(
    override val url: String,
    override val id: Int,
    override val ownerId:Int,
    val artist: String,
    val title: String) :Attachment

class DocAttachments(
    override val url: String,
    override val id: Int,
    override val ownerId:Int
) :Attachment

class PostedPhotoAttachments(
    override val url: String,
    override val id: Int,
    override val ownerId:Int
) :Attachment

class Likes (
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean,
    count: Int = 0
) {
    var count = count
        set (value) {
            if (value < 0) {
                return
            }
            field = value
        }
}

class Copyright (
    val count: Int,
    val canPost: Boolean,
    val name: Boolean,
    val type: Boolean,
)

class Reposts  (
    val id: Int,
    val user_reposted: Boolean,
)

class Donut (
    val isDonut : Boolean,
    val paidDuration: Int,
    val placeholder : Any,
    val canPublishFreeCopy : Boolean,
    val editMode : String
)

class Comment (
    val authorId:Long,
    val PostId: Long,
    val fromGroup: Int = 0,
    val message: String?,
    val replyToUser:Long?,
    val replyToComment: Long?,
    val attachments: Attachment?,
    val stickerId: Long?,
)

class Comments (
    val count: Long,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

class Geo  (
    val type: String,
    val coordinates: String,
    val place : Boolean,
)



