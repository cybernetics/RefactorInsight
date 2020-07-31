package org.jetbrains.research.refactorinsight.data.types.methods;

import gr.uom.java.xmi.diff.RemoveVariableAnnotationRefactoring;
import org.jetbrains.research.refactorinsight.data.Group;
import org.jetbrains.research.refactorinsight.data.RefactoringInfo;
import org.jetbrains.research.refactorinsight.data.RefactoringLine;
import org.jetbrains.research.refactorinsight.utils.StringUtils;
import org.refactoringminer.api.Refactoring;

public class RemoveParameterAnnotationHandler
    extends org.jetbrains.research.refactorinsight.data.types.Handler {
  @Override
  public RefactoringInfo specify(Refactoring refactoring, RefactoringInfo info) {
    RemoveVariableAnnotationRefactoring ref = (RemoveVariableAnnotationRefactoring) refactoring;
    String classNameBefore = ref.getOperationBefore().getClassName();
    String classNameAfter = ref.getOperationAfter().getClassName();

    return info.setGroup(Group.METHOD)
        .setDetailsBefore(classNameBefore)
        .setDetailsAfter(classNameAfter)
        .setNameBefore(StringUtils.calculateSignature(ref.getOperationBefore()))
        .setNameAfter(StringUtils.calculateSignature(ref.getOperationAfter()))
        .setElementAfter(null)
        .setElementBefore(ref.getAnnotation().toString() + " removed from "
            + ref.getVariableAfter().getVariableDeclaration().getVariableName())
        .addMarking(ref.getOperationBefore().codeRange(), ref.getOperationAfter().codeRange(),
            line -> line.addOffset(
                ref.getAnnotation().getLocationInfo(), RefactoringLine.MarkingOption.REMOVE)
                .setHasColumns(false),
            RefactoringLine.MarkingOption.NONE,
            true);
  }
}
