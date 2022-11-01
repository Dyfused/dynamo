@file:Suppress("unused")

package dyfused.dynamo.util

import dyfused.dynamo.core.DyChart
import dyfused.dynamo.core.DyNoteAsset

typealias NoteTransformer = (DyNoteAsset) -> Unit
typealias ChartTransformer = (DyChart) -> Unit

fun DyChart.forEachNotes(block: (DyNoteAsset) -> Unit) {
	forEachMainNotes(block)
	forEachLeftNotes(block)
	forEachRightNotes(block)
}

fun DyChart.forEachMainNotes(block: NoteTransformer) =
	mainNoteSet.noteSet.forEach(block)

fun DyChart.forEachLeftNotes(block: NoteTransformer) =
	leftNoteSet.noteSet.forEach(block)

fun DyChart.forEachRightNotes(block: NoteTransformer) =
	rightNoteSet.noteSet.forEach(block)

fun DyChart.transform(transformer: ChartTransformer): DyChart {
	return this.copy().apply(transformer)
}

fun DyChart.transformNotes(transformer: NoteTransformer): DyChart {
	return this.copy().apply { forEachNotes(transformer) }
}