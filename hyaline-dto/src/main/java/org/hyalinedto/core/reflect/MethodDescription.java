package org.hyalinedto.core.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MethodDescription {

	private Method method;

	private List<Annotation> annotations = new ArrayList<Annotation>();

	public Method getMethod() {
		return method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	public List<Annotation> getAnnotations() {
		return annotations;
	}

	public void setAnnotations(List<Annotation> annotations) {
		this.annotations = annotations;
	}

	public void addAnnotation(Annotation annotation) {
		annotations.add(annotation);
	}

}
