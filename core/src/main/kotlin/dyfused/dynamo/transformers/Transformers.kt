@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package dyfused.dynamo.transformers

import dyfused.dynamo.core.NoteType
import dyfused.dynamo.util.NoteTransformer

object Transformers {

	fun width(transform: (Double) -> Double): NoteTransformer = {
		it.width = transform(it.width)
	}

	fun widthRelative(ratio: Double): NoteTransformer = width { it * ratio }
	fun widthAbsolute(const: Double): NoteTransformer = width { const }

	fun type(transform: (NoteType) -> NoteType): NoteTransformer = {
		it.type = transform(it.type)
	}

	fun typeNormalToChain(): NoteTransformer = type { if(it == NoteType.NORMAL) NoteType.CHAIN else it  }

}