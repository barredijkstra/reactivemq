/*
 * Errors.scala
 *
 * Updated: Jan 29, 2015
 *
 * Copyright (c) 2015, CodeMettle
 */
package com.codemettle.reactivemq

import scala.util.control.NoStackTrace

/**
 * @author steven
 *
 */
case object ConnectionTimedOut extends Exception("Connection timed out") with NoStackTrace

case object ConnectionClosedWhileReconnecting
    extends Exception("User closed connection while in disconnected state") with NoStackTrace

case object UnableToConnect extends Exception("Unable to (re)connect") with NoStackTrace
