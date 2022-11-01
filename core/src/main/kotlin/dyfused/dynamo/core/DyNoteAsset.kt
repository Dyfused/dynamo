package dyfused.dynamo.core

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("CMapNoteAsset")
@JsonIgnoreProperties(ignoreUnknown = true)
data class DyNoteAsset(
	@JsonProperty("m_id")
	val id: Int,
	@JsonProperty("m_type")
	val type: NoteType,
	@JsonProperty("m_subId")
	val subId: Int,
	@JsonProperty("m_width")
	val width: Double,
	@JsonProperty("m_time")
	val time: Double,
	@JsonProperty("m_position")
	val position: Double,
)
