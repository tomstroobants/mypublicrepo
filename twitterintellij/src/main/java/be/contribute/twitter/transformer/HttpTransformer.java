package be.contribute.twitter.transformer;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class HttpTransformer extends AbstractTransformer 
{

	@Override
	protected Object doTransform(Object sourceObject, String encoding) throws TransformerException
	{
		return "Hello";
	}
}
