package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

	public interface Rhymersfactory {

		//TODO remove redundant public from interface
		public DefaultCountingOutRhymer getStandardRhymer();

		public DefaultCountingOutRhymer getFalseRhymer();

		public DefaultCountingOutRhymer getFIFORhymer();

		public DefaultCountingOutRhymer getHanoiRhymer();

	}
