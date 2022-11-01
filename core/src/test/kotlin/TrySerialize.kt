import MapperExample.get
import MapperExample.out
import kotlin.test.Test

private class TrySerialize {

	@Test
	fun testSerialize() {
		val exampleNames = listOf("example.xml", "example2.xml")

		exampleNames.forEach { f ->
			val chart = get(f)
			chart.out("format_$f")
		}
	}

}