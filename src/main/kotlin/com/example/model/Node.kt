package com.example.model

data class Node(
    val __typename: String?,
    val accessibility_caption: Any?,
    val comments_disabled: Boolean?,
    val dash_info: DashInfo?,
    val dimensions: Dimensions?,
    val display_url: String?,
    val edge_liked_by: EdgeLikedBy?,
    val edge_media_preview_like: EdgeMediaPreviewLike?,
    val edge_media_to_caption: EdgeMediaToCaption?,
    val edge_media_to_comment: EdgeMediaToComment?,
    val edge_media_to_tagged_user: EdgeMediaToTaggedUser?,
    val encoding_status: Any?,
    val fact_check_information: Any?,
    val fact_check_overall_rating: Any?,
    val felix_profile_grid_crop: Any?,
    val gating_info: Any?,
    val has_audio: Boolean?,
    val id: String?,
    val is_published: Boolean?,
    val is_video: Boolean?,
    val location: Any?,
    val media_overlay_info: Any?,
    val media_preview: String?,
    val owner: Owner?,
    val product_type: String?,
    val sharing_friction_info: SharingFrictionInfo?,
    val shortcode: String?,
    val taken_at_timestamp: Int?,
    val thumbnail_resources: List<ThumbnailResource>?,
    val thumbnail_src: String?,
    val title: String?,
    val tracking_token: String?,
    val video_duration: Double?,
    val video_url: String?,
    val video_view_count: Int?
)