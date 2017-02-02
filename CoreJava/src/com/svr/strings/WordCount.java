/**
 * 
 */
package com.svr.strings;

import java.util.Comparator;

/**
 * @author Venkata Saripella
 *
 */
public class WordCount implements Comparator<WordCount>{

private String name;
private Integer no;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Integer getNo() {
return no;
}
public void setNo(Integer no) {
this.no = no;
}
@Override
public String toString() {
return "MostOccured [name=" + name + ", no=" + no + "]";
}
@Override
public int hashCode() {
final int prime = 31;
int result = 1;
result = prime * result + ((name == null) ? 0 : name.hashCode());
result = prime * result + no;
return result;
}
@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
WordCount other = (WordCount) obj;
if (name == null) {
if (other.name != null)
return false;
} else if (!name.equals(other.name))
return false;
if (no != other.no)
return false;
return true;
}

@Override
public int compare(WordCount o1, WordCount o2) {
    return o2.getNo().compareTo(o1.getNo());
}
}
