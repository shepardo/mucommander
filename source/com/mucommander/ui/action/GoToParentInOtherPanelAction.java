/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2008 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.ui.action;

import com.mucommander.file.AbstractFile;
import com.mucommander.ui.main.FolderPanel;
import com.mucommander.ui.main.MainFrame;

import java.util.Hashtable;

/**
 * Opens the active panel's parent in the inactive panel.
 * <p>
 * This action is only enabled when the active panel has a parent.
 * </p>
 * @author Nicolas Rinaudo
 */
public class GoToParentInOtherPanelAction extends GoToParentAction {
    /**
     * Creates a new <code>GoToParentInOtherPanelAction</code> with the specified parameters.
     * @param mainFrame  frame to which the action is attached.
     * @param properties action's properties.
     */
    public GoToParentInOtherPanelAction(MainFrame mainFrame, Hashtable properties) {super(mainFrame, properties);}

    /**
     * Opens the active panel's parent in the inactive panel.
     */
    public void performAction() {goToParent(mainFrame.getActiveTable().getFolderPanel(), mainFrame.getInactiveTable().getFolderPanel());}
}