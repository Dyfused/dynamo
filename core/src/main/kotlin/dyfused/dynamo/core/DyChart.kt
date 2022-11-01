package dyfused.dynamo.core

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName("CMap")
data class DyChart(
	@JsonProperty("m_path")
	var path: String,
	@JsonProperty("m_mapID")
	var chartId: String,
	@JsonProperty("m_leftRegion")
	var leftType: SideType,
	@JsonProperty("m_rightRegion")
	var rightType: SideType,
	@JsonProperty("m_notes")
	var mainNoteSet: DyNoteSet,
	@JsonProperty("m_notesLeft")
	var leftNoteSet: DyNoteSet,
	@JsonProperty("m_notesRight")
	var rightNoteSet: DyNoteSet,
	@JsonProperty("m_timeOffset")
	var timeOffset: Double,
	@JsonProperty("m_barPerMin")
	var barPerMinute: Double,
	@JsonProperty("m_argument")
	var argument: Any,
)
