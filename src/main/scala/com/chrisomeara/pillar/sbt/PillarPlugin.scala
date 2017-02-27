package com.chrisomeara.pillar.sbt

import sbt._
import Keys._

object PillarPlugin extends AutoPlugin {
  object autoImport {
    lazy val pillarDestroy: TaskKey[Unit] = taskKey[Unit]("destroys the Cassandra keyspace")
    lazy val pillarInitialize: TaskKey[Unit] = taskKey[Unit]("initialize the Cassandra keyspace")
    lazy val pillarMigrate: TaskKey[Unit] = taskKey[Unit]("applies migrations the Cassandra keyspace")
  }

  import autoImport._

  override lazy val projectSettings = Seq(
    pillarDestroy := { streams.value.log.info("destroy") },
    pillarInitialize := { streams.value.log.info("initialize") },
    pillarMigrate := { streams.value.log.info("migrate") }
  )
}
