package vn.com.cmc

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("vn.com.cmc")
		.start()
}

