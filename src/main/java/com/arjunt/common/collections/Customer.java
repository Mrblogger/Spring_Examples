/**
 * 
 */
package com.arjunt.common.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author arjun
 *
 */
public class Customer {
	
	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object,Object> maps;
	private Properties props;
	
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	@Override
	public String toString() {
		return "Customer [lists=" + lists + ", sets=" + sets + ", maps=" + maps
				+ ", pros=" + props + "]";
	}
	public List<Object> getLists() {
		return lists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public Map<Object, Object> getMaps() {
		return maps;
	}
	public Properties getProps() {
		return props;
	}
	
}
