/**
 * Copyright (c) 2009 i>clicker (R) <http://www.iclicker.com/dnn/>
 *
 * This file is part of i>clicker Sakai integrate.
 *
 * i>clicker Sakai integrate is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * i>clicker Sakai integrate is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with i>clicker Sakai integrate.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.ac.uct.cet.sakai.gradebook.entityproviders.logic;

import java.util.List;
import java.util.Vector;


/**
 * This holds the values of all the items in a gradebook and the users/scores
 * 
 * @author Aaron Zeckoski (azeckoski @ gmail.com)
 */
public class Gradebook {
    public String id;
    public String courseId;

    public List<Student> students = new Vector<Student>();
    public List<GradebookItem> items = new Vector<GradebookItem>();

    public Gradebook(String id) {
        this.id = id;
        this.courseId = id;
    }

    @Override
    public String toString() {
        return id+":("+students+"):"+items;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Gradebook other = (Gradebook) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
