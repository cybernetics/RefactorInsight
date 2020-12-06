package org.jetbrains.research.refactorinsight.data.types.attributes;

import gr.uom.java.xmi.diff.RenameAttributeRefactoring;
import org.jetbrains.research.refactorinsight.data.Group;
import org.jetbrains.research.refactorinsight.data.RefactoringInfo;
import org.jetbrains.research.refactorinsight.data.RefactoringLine;
import org.jetbrains.research.refactorinsight.data.types.Handler;
import org.refactoringminer.api.Refactoring;

public class RenameAttributeHandler extends Handler {

  @Override
  public RefactoringInfo specify(Refactoring refactoring, RefactoringInfo info) {
/*    RenameAttributeRefactoring ref = (RenameAttributeRefactoring) refactoring;

    String classNameBefore = ref.getClassNameBefore();
    String classNameAfter = ref.getClassNameAfter();

    return info.setGroup(Group.ATTRIBUTE)
        .setGroupId(ref.getClassNameAfter() + "." + ref.getRenamedAttribute().getVariableName())
        .addMarking(ref.getOriginalAttribute().codeRange(),
            ref.getRenamedAttribute().codeRange(),
            line -> line.addOffset(ref.getOriginalAttribute().getLocationInfo(),

                ref.getRenamedAttribute().getLocationInfo()),
            RefactoringLine.MarkingOption.NONE, true)
        .setNameBefore(ref.getOriginalAttribute().getVariableDeclaration().toQualifiedString())
        .setNameAfter(ref.getRenamedAttribute().getVariableDeclaration().toQualifiedString())
        .setDetailsBefore(classNameBefore)
        .setDetailsAfter(classNameAfter);*/
    return null;
  }
}
