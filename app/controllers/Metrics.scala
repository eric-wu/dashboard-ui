package controllers

import play.api.mvc.{Action, Controller}
import models.Metric

object Metrics extends Controller with Security {
  def all = AuthorizedAction {
    Ok(views.html.metrics(Metric.metrics))
  }
}
