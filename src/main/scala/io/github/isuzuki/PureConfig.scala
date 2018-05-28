package io.github.isuzuki

import pureconfig.error.ConfigReaderFailures

object PureConfig {
  case class Pure (pure: User)

  case class User (
    user: String,
    pass: String
  )

  val pconfig: Either[ConfigReaderFailures, Pure] = pureconfig.loadConfig[Pure]
}
