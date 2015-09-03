package com.liyaos.forklift.slick

import slick.backend.DatabaseConfig
import slick.driver.JdbcProfile

trait SlickMigrationsConfig {
  val dbConfig = DatabaseConfig.forConfig[JdbcProfile]("migrations.slick")
}

object SlickMigrationsConfig extends SlickMigrationsConfig
