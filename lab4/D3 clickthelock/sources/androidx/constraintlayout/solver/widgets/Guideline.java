package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Guideline extends ConstraintWidget {
    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNWON = -1;
    public static final int VERTICAL = 1;
    protected float mRelativePercent = -1.0f;
    protected int mRelativeBegin = -1;
    protected int mRelativeEnd = -1;
    private ConstraintAnchor mAnchor = this.mTop;
    private int mOrientation = 0;
    private int mMinimumPosition = 0;

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String getType() {
        return "Guideline";
    }

    public Guideline() {
        this.mAnchors.clear();
        this.mAnchors.add(this.mAnchor);
        int length = this.mListAnchors.length;
        for (int i = 0; i < length; i++) {
            this.mListAnchors[i] = this.mAnchor;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Guideline guideline = (Guideline) constraintWidget;
        this.mRelativePercent = guideline.mRelativePercent;
        this.mRelativeBegin = guideline.mRelativeBegin;
        this.mRelativeEnd = guideline.mRelativeEnd;
        setOrientation(guideline.mOrientation);
    }

    public int getRelativeBehaviour() {
        if (this.mRelativePercent != -1.0f) {
            return 0;
        }
        if (this.mRelativeBegin != -1) {
            return 1;
        }
        return this.mRelativeEnd != -1 ? 2 : -1;
    }

    public void setOrientation(int i) {
        if (this.mOrientation == i) {
            return;
        }
        this.mOrientation = i;
        this.mAnchors.clear();
        if (this.mOrientation == 1) {
            this.mAnchor = this.mLeft;
        } else {
            this.mAnchor = this.mTop;
        }
        this.mAnchors.add(this.mAnchor);
        int length = this.mListAnchors.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.mListAnchors[i2] = this.mAnchor;
        }
    }

    public ConstraintAnchor getAnchor() {
        return this.mAnchor;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public void setMinimumPosition(int i) {
        this.mMinimumPosition = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public ConstraintAnchor getAnchor(ConstraintAnchor.Type type) {
        switch (type) {
            case LEFT:
            case RIGHT:
                if (this.mOrientation == 1) {
                    return this.mAnchor;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.mOrientation == 0) {
                    return this.mAnchor;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(type.name());
    }

    public void setGuidePercent(int i) {
        setGuidePercent(i / 100.0f);
    }

    public void setGuidePercent(float f) {
        if (f > -1.0f) {
            this.mRelativePercent = f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuideBegin(int i) {
        if (i > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = i;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuideEnd(int i) {
        if (i > -1) {
            this.mRelativePercent = -1.0f;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = i;
        }
    }

    public float getRelativePercent() {
        return this.mRelativePercent;
    }

    public int getRelativeBegin() {
        return this.mRelativeBegin;
    }

    public int getRelativeEnd() {
        return this.mRelativeEnd;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem) {
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) getParent();
        if (constraintWidgetContainer == null) {
            return;
        }
        ConstraintAnchor anchor = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor anchor2 = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.RIGHT);
        boolean z = this.mParent != null && this.mParent.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (this.mOrientation == 0) {
            anchor = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.TOP);
            anchor2 = constraintWidgetContainer.getAnchor(ConstraintAnchor.Type.BOTTOM);
            z = this.mParent != null && this.mParent.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        }
        if (this.mRelativeBegin != -1) {
            SolverVariable createObjectVariable = linearSystem.createObjectVariable(this.mAnchor);
            linearSystem.addEquality(createObjectVariable, linearSystem.createObjectVariable(anchor), this.mRelativeBegin, 8);
            if (z) {
                linearSystem.addGreaterThan(linearSystem.createObjectVariable(anchor2), createObjectVariable, 0, 5);
                return;
            }
            return;
        }
        if (this.mRelativeEnd == -1) {
            if (this.mRelativePercent != -1.0f) {
                linearSystem.addConstraint(LinearSystem.createRowDimensionPercent(linearSystem, linearSystem.createObjectVariable(this.mAnchor), linearSystem.createObjectVariable(anchor2), this.mRelativePercent));
                return;
            }
            return;
        }
        SolverVariable createObjectVariable2 = linearSystem.createObjectVariable(this.mAnchor);
        SolverVariable createObjectVariable3 = linearSystem.createObjectVariable(anchor2);
        linearSystem.addEquality(createObjectVariable2, createObjectVariable3, -this.mRelativeEnd, 8);
        if (z) {
            linearSystem.addGreaterThan(createObjectVariable2, linearSystem.createObjectVariable(anchor), 0, 5);
            linearSystem.addGreaterThan(createObjectVariable3, createObjectVariable2, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void updateFromSolver(LinearSystem linearSystem) {
        if (getParent() == null) {
            return;
        }
        int objectVariableValue = linearSystem.getObjectVariableValue(this.mAnchor);
        if (this.mOrientation == 1) {
            setX(objectVariableValue);
            setY(0);
            setHeight(getParent().getHeight());
            setWidth(0);
            return;
        }
        setX(0);
        setY(objectVariableValue);
        setWidth(getParent().getWidth());
        setHeight(0);
    }

    void inferRelativePercentPosition() {
        float x = getX() / getParent().getWidth();
        if (this.mOrientation == 0) {
            x = getY() / getParent().getHeight();
        }
        setGuidePercent(x);
    }

    void inferRelativeBeginPosition() {
        int x = getX();
        if (this.mOrientation == 0) {
            x = getY();
        }
        setGuideBegin(x);
    }

    void inferRelativeEndPosition() {
        int width = getParent().getWidth() - getX();
        if (this.mOrientation == 0) {
            width = getParent().getHeight() - getY();
        }
        setGuideEnd(width);
    }

    public void cyclePosition() {
        if (this.mRelativeBegin != -1) {
            inferRelativePercentPosition();
        } else if (this.mRelativePercent != -1.0f) {
            inferRelativeEndPosition();
        } else if (this.mRelativeEnd != -1) {
            inferRelativeBeginPosition();
        }
    }

    public boolean isPercent() {
        return this.mRelativePercent != -1.0f && this.mRelativeBegin == -1 && this.mRelativeEnd == -1;
    }
}