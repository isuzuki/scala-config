package io.github.isuzuki

case class Config (
  admin   : Config.Admin,
  database: Config.Database,
  external: Config.External
)

object Config {
  case class Admin (
    user: String,
    pass: String
  )

  case class Database (
    user: String,
    pass: String
  )

  case class External (
    api: External.Api
  )

  object External {
    case class Api (
      key: String
    )
  }
}
