import com.fasterxml.jackson.dataformat.xml.XmlMapper
import dyfused.dynamo.core.DyChart
import java.io.File
import kotlin.test.Test

private class TrySerialize {

	val mapper = XmlMapper()

	@Test
	fun testSerialize() {
		val exampleNames = listOf("example.xml", "example2.xml")

		exampleNames.forEach { f ->
			val source = File(javaClass.getResource(f)?.file ?: error("undefined file"))
			mapper.readValue(source, DyChart::class.java).let(::println)
		}
	}

}