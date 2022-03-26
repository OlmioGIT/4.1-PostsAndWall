package ru.netology.data

data class Post(
    val id: Long =0,
    val authorId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean = false,
    val comments: Comments,
    val likes: Int = 0,
    val views: Int = 0,
    val signerId: Int,
    val canPin: Boolean= false,
    val canDelete: Boolean= false,
    val canEdit: Boolean= false,
    val isPinned: Boolean= false,
    val markedAsAds: Boolean= false,
    val postponedId: Int,
){


}

//class Likes (
//    val userLikes: Boolean,
//    val canLike: Boolean,
//    val canPublish: Boolean,
//    count: Int = 0
//) {
//    var count = count
//        set (value) {
//            if (value < 0) {
//                return
//            }
//            field = value
//        }
//}

class Comments (
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)


