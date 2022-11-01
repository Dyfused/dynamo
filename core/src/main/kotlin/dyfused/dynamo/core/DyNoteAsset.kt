package dyfused.dynamo.core

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("CMapNoteAsset")
@JsonIgnoreProperties(ignoreUnknown = true)
data class DyNoteAsset(
	@JsonProperty("m_id")
	var id: Int,
	@JsonProperty("m_type")
	var type: NoteType,
	@JsonProperty("m_subId")
	var subId: Int,
	@JsonProperty("m_width")
	var width: Double,
	@JsonProperty("m_time")
	var time: Double,
	@JsonProperty("m_position")
	var position: Double,
)
