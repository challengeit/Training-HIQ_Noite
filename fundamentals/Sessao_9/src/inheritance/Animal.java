package inheritance;


public abstract class Animal implements Mammal
{
	private String _name;
	private int _legNumber;
	private boolean _hasFur;
	
	public Animal(String name, int legNumber, boolean hasFur) 
	{
		super();
		_name = name;
		_legNumber = legNumber;
		_hasFur = hasFur;
	}
	
	public Animal(String name)
	{
		_name = name;
		_legNumber = 0;
		_hasFur = false;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public int getLegNumber() {
		return _legNumber;
	}

	public void setLegNumber(int _legNumber) {
		this._legNumber = _legNumber;
	}

	public boolean hasFur() {
		return _hasFur;
	}

	public void setHasFur(boolean _hasFur) {
		this._hasFur = _hasFur;
	}
	
	public abstract void walk();
}
