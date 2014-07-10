/* CVS $Id: $ */
package com.epimorphics.lda.vocabularies; 
import com.hp.hpl.jena.rdf.model.*;
 
/**
 * Vocabulary definitions from /usr/local/elda/elda-lda/../vocabs/api.ttl 
 * @author Auto-generated by schemagen on 10 Jul 2014 15:44 
 */
public class API {
    /** <p>The RDF model that holds the vocabulary terms</p> */
    private static Model m_model = ModelFactory.createDefaultModel();
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://purl.org/linked-data/api/vocab#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    /** <p>The base URI of the API, which is distinct from the URI of the SPARQL endpoint 
     *  that it queries or the base URI of the instances that it returns. This base 
     *  URI is stripped from the request URI before any matching is done against the 
     *  endpoints defined for the API.</p>
     */
    public static final Property base = m_model.createProperty( "http://purl.org/linked-data/api/vocab#base" );
    
    /** <p>The mechanism used within the URI to override normal content negotiation and 
     *  deliver a particular results format.</p>
     */
    public static final Property contentNegotiation = m_model.createProperty( "http://purl.org/linked-data/api/vocab#contentNegotiation" );
    
    /** <p>The default formatter used if none is explicitly selected within the request 
     *  URI.</p>
     */
    public static final Property defaultFormatter = m_model.createProperty( "http://purl.org/linked-data/api/vocab#defaultFormatter" );
    
    /** <p>The default size of lists that will be returned by the API or endpoint.</p> */
    public static final Property defaultPageSize = m_model.createProperty( "http://purl.org/linked-data/api/vocab#defaultPageSize" );
    
    /** <p>The default viewer used if none is explicitly selected within the request 
     *  URI.</p>
     */
    public static final Property defaultViewer = m_model.createProperty( "http://purl.org/linked-data/api/vocab#defaultViewer" );
    
    public static final Property definition = m_model.createProperty( "http://purl.org/linked-data/api/vocab#definition" );
    
    /** <p>An endpoint specified by the API, against which requests can be made.</p> */
    public static final Property endpoint = m_model.createProperty( "http://purl.org/linked-data/api/vocab#endpoint" );
    
    public static final Property extendedMetadataVersion = m_model.createProperty( "http://purl.org/linked-data/api/vocab#extendedMetadataVersion" );
    
    /** <p>A set of parameter bindings in the same format as is used within the query 
     *  of a URI, used to provide a simple way of filtering the sequence of items 
     *  that the selector selects.</p>
     */
    public static final Property filter = m_model.createProperty( "http://purl.org/linked-data/api/vocab#filter" );
    
    /** <p>A formatter that can be used with the endpoint.</p> */
    public static final Property formatter = m_model.createProperty( "http://purl.org/linked-data/api/vocab#formatter" );
    
    /** <p>Other viewers that describe properties that should be incorporated into this 
     *  view.</p>
     */
    public static final Property include = m_model.createProperty( "http://purl.org/linked-data/api/vocab#include" );
    
    /** <p>A template for the URI of the item that the item endpoint should return. Any 
     *  instances of {varName} within the string are replaced by the value of the 
     *  relevant variable.</p>
     */
    public static final Property itemTemplate = m_model.createProperty( "http://purl.org/linked-data/api/vocab#itemTemplate" );
    
    public static final Property items = m_model.createProperty( "http://purl.org/linked-data/api/vocab#items" );
    
    public static final Property label = m_model.createProperty( "http://purl.org/linked-data/api/vocab#label" );
    
    public static final Property lang = m_model.createProperty( "http://purl.org/linked-data/api/vocab#lang" );
    
    /** <p>The maximum size of lists that will be returned by the API.</p> */
    public static final Property maxPageSize = m_model.createProperty( "http://purl.org/linked-data/api/vocab#maxPageSize" );
    
    /** <p>The mime type that the formatter returns and that it should be used with.</p> */
    public static final Property mimeType = m_model.createProperty( "http://purl.org/linked-data/api/vocab#mimeType" );
    
    public static final Property multiValued = m_model.createProperty( "http://purl.org/linked-data/api/vocab#multiValued" );
    
    /** <p>The name of the resource.</p> */
    public static final Property name = m_model.createProperty( "http://purl.org/linked-data/api/vocab#name" );
    
    public static final Property namespace = m_model.createProperty( "http://purl.org/linked-data/api/vocab#namespace" );
    
    /** <p>A space separated sequence of OrderConditions suitable for using in a SPARQL 
     *  ORDER BY clause. This is used to order the sequence of items that the selector 
     *  selects.</p>
     */
    public static final Property orderBy = m_model.createProperty( "http://purl.org/linked-data/api/vocab#orderBy" );
    
    public static final Property page = m_model.createProperty( "http://purl.org/linked-data/api/vocab#page" );
    
    /** <p>The parent selector, from which filters and sort specifications may be inherited.</p> */
    public static final Property parent = m_model.createProperty( "http://purl.org/linked-data/api/vocab#parent" );
    
    public static final Property prefix = m_model.createProperty( "http://purl.org/linked-data/api/vocab#prefix" );
    
    public static final Property prefixMapping = m_model.createProperty( "http://purl.org/linked-data/api/vocab#prefixMapping" );
    
    public static final Property processor = m_model.createProperty( "http://purl.org/linked-data/api/vocab#processor" );
    
    /** <p>A comma-separated list of property paths that indicate the information that 
     *  should be included in the view.</p>
     */
    public static final Property properties = m_model.createProperty( "http://purl.org/linked-data/api/vocab#properties" );
    
    /** <p>A property chain (which may be a single property) that indicates information 
     *  that should be included in the view.</p>
     */
    public static final Property property = m_model.createProperty( "http://purl.org/linked-data/api/vocab#property" );
    
    /** <p>A SPARQL WHERE and ORDER BY clause that can be used to select an ordered list 
     *  of resources. It should include the binding of an ?item variable for the selected 
     *  items.</p>
     */
    public static final Property select = m_model.createProperty( "http://purl.org/linked-data/api/vocab#select" );
    
    public static final Property selectionResult = m_model.createProperty( "http://purl.org/linked-data/api/vocab#selectionResult" );
    
    /** <p>The selector that should be used to generate the list of items.</p> */
    public static final Property selector = m_model.createProperty( "http://purl.org/linked-data/api/vocab#selector" );
    
    /** <p>A sequence of comma-separated sort specifications indicating the sorting of 
     *  the items in the sequence that the selector selects. A leading hyphen indicates 
     *  a reverse sort.</p>
     */
    public static final Property sort = m_model.createProperty( "http://purl.org/linked-data/api/vocab#sort" );
    
    /** <p>The endpoint used to serve up the results that are exposed by the API. This 
     *  should not include the query parameters within the URI.</p>
     */
    public static final Property sparqlEndpoint = m_model.createProperty( "http://purl.org/linked-data/api/vocab#sparqlEndpoint" );
    
    public static final Property structured = m_model.createProperty( "http://purl.org/linked-data/api/vocab#structured" );
    
    /** <p>The XSLT stylesheet that should be used by an XSLT formatter to generate a 
     *  representation of the RDF graph</p>
     */
    public static final Property stylesheet = m_model.createProperty( "http://purl.org/linked-data/api/vocab#stylesheet" );
    
    /** <p>SPARQL that can be used to construct a graph based on an item (identified 
     *  in the SPARQL as ?item).</p>
     */
    public static final Property template = m_model.createProperty( "http://purl.org/linked-data/api/vocab#template" );
    
    public static final Property termBinding = m_model.createProperty( "http://purl.org/linked-data/api/vocab#termBinding" );
    
    public static final Property type = m_model.createProperty( "http://purl.org/linked-data/api/vocab#type" );
    
    /** <p>A template that can be used to match against request URIs. This template can 
     *  contain variable names within {}s; when the URI is matched then the substrings 
     *  that appear in these locations are bound to the named variable.</p>
     */
    public static final Property uriTemplate = m_model.createProperty( "http://purl.org/linked-data/api/vocab#uriTemplate" );
    
    public static final Property value = m_model.createProperty( "http://purl.org/linked-data/api/vocab#value" );
    
    public static final Property variable = m_model.createProperty( "http://purl.org/linked-data/api/vocab#variable" );
    
    public static final Property variableBinding = m_model.createProperty( "http://purl.org/linked-data/api/vocab#variableBinding" );
    
    /** <p>A viewer that can be used with the endpoint.</p> */
    public static final Property viewer = m_model.createProperty( "http://purl.org/linked-data/api/vocab#viewer" );
    
    public static final Property viewingResult = m_model.createProperty( "http://purl.org/linked-data/api/vocab#viewingResult" );
    
    /** <p>A vocabulary that should be used by the configuration to provide labels for 
     *  properties. To be recognised for filtering, a property must be defined either 
     *  within this vocabulary or in the configuration file itself.</p>
     */
    public static final Property vocabulary = m_model.createProperty( "http://purl.org/linked-data/api/vocab#vocabulary" );
    
    public static final Property wasResultOf = m_model.createProperty( "http://purl.org/linked-data/api/vocab#wasResultOf" );
    
    /** <p>A GroupGraphPattern suitable for embedding within a SPARQL WHERE clause. This 
     *  is used for filtering the set of items that the selector selects.</p>
     */
    public static final Property where = m_model.createProperty( "http://purl.org/linked-data/api/vocab#where" );
    
    public static final Resource API = m_model.createResource( "http://purl.org/linked-data/api/vocab#API" );
    
    public static final Resource ContentNegotiationStrategy = m_model.createResource( "http://purl.org/linked-data/api/vocab#ContentNegotiationStrategy" );
    
    /** <p>A formatter that generates a simple CSV representation of an RDF graph</p> */
    public static final Resource CsvFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#CsvFormatter" );
    
    /** <p>An endpoint exposed by the API.</p> */
    public static final Resource Endpoint = m_model.createResource( "http://purl.org/linked-data/api/vocab#Endpoint" );
    
    public static final Resource Execution = m_model.createResource( "http://purl.org/linked-data/api/vocab#Execution" );
    
    /** <p>A formatter that creates a representation from an RDF graph.</p> */
    public static final Resource Formatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#Formatter" );
    
    public static final Resource Hidden = m_model.createResource( "http://purl.org/linked-data/api/vocab#Hidden" );
    
    public static final Resource HtmlFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#HtmlFormatter" );
    
    /** <p>An endpoint that returns information about a single instance.</p> */
    public static final Resource ItemEndpoint = m_model.createResource( "http://purl.org/linked-data/api/vocab#ItemEndpoint" );
    
    /** <p>A formatter that generates a simple JSON representation of an RDF graph</p> */
    public static final Resource JsonFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#JsonFormatter" );
    
    /** <p>An endpoint that returns information about a list of instances.</p> */
    public static final Resource ListEndpoint = m_model.createResource( "http://purl.org/linked-data/api/vocab#ListEndpoint" );
    
    public static final Resource Multivalued = m_model.createResource( "http://purl.org/linked-data/api/vocab#Multivalued" );
    
    public static final Resource Page = m_model.createResource( "http://purl.org/linked-data/api/vocab#Page" );
    
    /** <p>(Elda extension) A datatype to mark the values of a property as being untyped 
     *  literals.</p>
     */
    public static final Resource PlainLiteral = m_model.createResource( "http://purl.org/linked-data/api/vocab#PlainLiteral" );
    
    /** <p>A datatype to mark the values of a property as being untyped, unlanguaged 
     *  literals.</p>
     */
    public static final Resource RawLiteral = m_model.createResource( "http://purl.org/linked-data/api/vocab#RawLiteral" );
    
    /** <p>A formatter that generates an RDF/XML representation of an RDF graph</p> */
    public static final Resource RdfXmlFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#RdfXmlFormatter" );
    
    /** <p>A specification of an ordered list of resources.</p> */
    public static final Resource Selector = m_model.createResource( "http://purl.org/linked-data/api/vocab#Selector" );
    
    public static final Resource Service = m_model.createResource( "http://purl.org/linked-data/api/vocab#Service" );
    
    /** <p>(Elda extension) A datatype to mark the values of a property as being unadorned 
     *  literals.</p>
     */
    public static final Resource SimpleLiteral = m_model.createResource( "http://purl.org/linked-data/api/vocab#SimpleLiteral" );
    
    /** <p>A formatter that gives the default Turtle representation of an RDF graphA 
     *  formatter that generates an Turtle representation of an RDF graph</p>
     */
    public static final Resource TurtleFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#TurtleFormatter" );
    
    /** <p>A specification of a view of a particular item.</p> */
    public static final Resource Viewer = m_model.createResource( "http://purl.org/linked-data/api/vocab#Viewer" );
    
    /** <p>A formatter that generates a simple XML representation of an RDF graph</p> */
    public static final Resource XmlFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#XmlFormatter" );
    
    /** <p>A formatter that uses an XSLT stylesheet to generates a representation of 
     *  an RDF graph</p>
     */
    public static final Resource XsltFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#XsltFormatter" );
    
    /** <p>A viewer that returns the type and label of the item.</p> */
    public static final Resource basicViewer = m_model.createResource( "http://purl.org/linked-data/api/vocab#basicViewer" );
    
    /** <p>A formatter that gives the default simple CSV representation of an RDF graph</p> */
    public static final Resource csvFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#csvFormatter" );
    
    /** <p>A viewer that returns a graph created from a DESCRIBE query.</p> */
    public static final Resource describeViewer = m_model.createResource( "http://purl.org/linked-data/api/vocab#describeViewer" );
    
    /** <p>A formatter that gives the default simple JSON representation of an RDF graph</p> */
    public static final Resource jsonFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#jsonFormatter" );
    
    /** <p>A viewer that returns the graph created from a DESCRIBE query, supplemented 
     *  by labels for linked resources.</p>
     */
    public static final Resource labelledDescribeViewer = m_model.createResource( "http://purl.org/linked-data/api/vocab#labelledDescribeViewer" );
    
    /** <p>This content negotiation strategy uses the _format parameter within the URI 
     *  to indicate the formatter that should be used to format the results of the 
     *  request.</p>
     */
    public static final Resource parameterBased = m_model.createResource( "http://purl.org/linked-data/api/vocab#parameterBased" );
    
    /** <p>A formatter that gives the default RDF/XML representation of an RDF graph</p> */
    public static final Resource rdfXmlFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#rdfXmlFormatter" );
    
    /** <p>This content negotiation strategy uses the suffix used on the last segment 
     *  within the request URI to indicate the formatter that should be used to format 
     *  the results of the request.</p>
     */
    public static final Resource suffixBased = m_model.createResource( "http://purl.org/linked-data/api/vocab#suffixBased" );
    
    /** <p>A formatter that gives the default simple XML representation of an RDF graph</p> */
    public static final Resource xmlFormatter = m_model.createResource( "http://purl.org/linked-data/api/vocab#xmlFormatter" );
    
}
