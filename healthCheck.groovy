#!/usr/bin/env groovy

@Grab('com.github.groovy-wslite:groovy-wslite:1.1.3')

import wslite.rest.RESTClient

def sanityStarter(){
  println 'Starting sanity check'
  def client = new RESTClient("https://webflux.josdem.io/")
  def response = client.get(path:'/categories/en')
  assert 200 == response.statusCode
  println 'Up and running!'
}

sanityStarter()

