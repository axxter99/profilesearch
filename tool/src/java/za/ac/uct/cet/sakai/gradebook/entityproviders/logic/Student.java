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

import java.util.Set;



/**
 * Represents a student in the course gradebook, this only makes sense in the context of a course or
 * a gradebook
 * 
 * @author Aaron Zeckoski (azeckoski @ gmail.com)
 */
public class Student extends User {

    public Boolean clickerRegistered;


    protected Student() {
    }

    public Student(String userId, String username, String name) {
        super(userId, username, name, null, null);
    }

    public Student(String userId, String username, String name, String sortName, String email) {
        super(userId, username, name, sortName, email);
    }



}
