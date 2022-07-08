package everyday.day8.genericity.clean;

/**
 * @Description 多态和泛型的冲突
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/8 20:58
 * @Version 1.0
 */

import java.util.Date;

public class DatePair extends Pair<Date>{
	@Override
	public Date getValue() {
		return super.getValue();
	}

	@Override
	public void setValue(Date value) {
		super.setValue(value);
	}

	public static void main(String[] args) {
		DatePair datePair = new DatePair();
		datePair.setValue(new Date());
	}

}