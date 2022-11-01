import dyfused.dynamo.core.DyChart
import dyfused.dynamo.dynamoMapper
import java.io.File

object MapperExample {

	fun get(path: String): DyChart {
		val source = File(javaClass.getResource(path)?.file ?: error("undefined file"))
		return dynamoMapper.readValue(source, DyChart::class.java)
	}

	fun DyChart.out(path: String) {
		val f = File("./out", path).also {
			it.parentFile.mkdirs()
			it.createNewFile()
		}
		dynamoMapper.writerFor(DyChart::class.java).writeValue(f, this)
	}

}