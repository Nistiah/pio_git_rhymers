package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {
	/**
	 * couting DefaultCountingOutRhymers object creation
	 */
	//TODO: improve names, temp and ret are not the best
	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	/**
	 * counting out methode
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}
