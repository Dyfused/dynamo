package dyfused.dynamo.core

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonTypeName

@JsonTypeName("CMap")
data class DyChart(
	@JsonProperty("m_path")
	val path: String,
	@JsonProperty("m_mapID")
	val chartId: String,
	@JsonProperty("m_leftRegion")
	val leftType: SideType,
	@JsonProperty("m_rightRegion")
	val rightType: SideType,
	@JsonProperty("m_notes")
	val mainNoteSet: DyNoteSet,
	@JsonProperty("m_notesLeft")
	val leftNoteSet: DyNoteSet,
	@JsonProperty("m_notesRight")
	val rightNoteSet: DyNoteSet,
	@JsonProperty("m_timeOffset")
	val timeOffset: Double,
	@JsonProperty("m_barPerMin")
	val barPerMinute: Double,
	@JsonProperty("m_argument")
	val argument: Any,
)
