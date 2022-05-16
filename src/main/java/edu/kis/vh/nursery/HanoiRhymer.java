package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
//zle sformatowane to: wiersz 5, 12, 14, 15
// teoretycznie moznaby powiedziec, ze wiersz 13 rowniez, ale poprawa 12 sprawia, ze 13 jest poprawny

//alt+-> pozwala na łatwe przeskakiwanie pomiędzy otwartymi w IDE plikami