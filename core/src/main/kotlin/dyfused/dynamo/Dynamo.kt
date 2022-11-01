package dyfused.dynamo

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import com.fasterxml.jackson.module.kotlin.kotlinModule

val dynamoMapper: ObjectMapper = XmlMapper()
	.registerModule(kotlinModule())
	.enable(SerializationFeature.INDENT_OUTPUT)