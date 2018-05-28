package io.github

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus._
import net.ceedubs.ficus.readers.ArbitraryTypeReader._

package object isuzuki {
  val config: Config = ConfigFactory.load().as[Config]("app")
}
