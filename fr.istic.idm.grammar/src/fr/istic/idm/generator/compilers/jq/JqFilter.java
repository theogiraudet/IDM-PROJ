package fr.istic.idm.generator.compilers.jq;

public abstract class JqFilter {
	
	private JqFilter nextFilter;
	
	public final void pipe(JqFilter nextFilter) {
		this.nextFilter = nextFilter;
	}
	
	public final String toJq() {
		return toJqString() + nextFilter != null ? " | " + nextFilter.toJq() : "";
	}
	
	protected abstract String toJqString();

}
