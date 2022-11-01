package dyfused.dynamo.core

import com.fasterxml.jackson.annotation.JsonProperty

data class DyNoteSet(
	@JsonProperty("m_notes")
	val noteSet: List<DyNoteAsset>,
)
