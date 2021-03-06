name := "test"

TaskKey[Unit]("check-same") <<= compile in Configurations.Compile map { case analysis: Analysis =>
	analysis.apis.internal foreach { case (_, api) =>
		assert( xsbt.api.SameAPI(api.api, api.api) )
	}
}