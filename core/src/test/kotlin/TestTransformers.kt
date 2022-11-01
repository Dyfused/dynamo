import MapperExample.out
import dyfused.dynamo.transformers.Transformers
import dyfused.dynamo.util.transformNotes
import kotlin.test.Test

private class TestTransformers {

	@Test
	fun testTransformWidthToHalf() {
		MapperExample.get("example.xml").transformNotes(Transformers.widthRelative(0.5)).out("example_width_trim_half.xml")
		MapperExample.get("example.xml").transformNotes(Transformers.typeNormalToChain()).out("example_normal_to_chain.xml")
	}

}